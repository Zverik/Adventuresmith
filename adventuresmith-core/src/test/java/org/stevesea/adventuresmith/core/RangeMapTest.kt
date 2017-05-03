/*
 * Copyright (c) 2016 Steve Christensen
 *
 * This file is part of Adventuresmith.
 *
 * Adventuresmith is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Adventuresmith is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Adventuresmith.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.stevesea.adventuresmith.core

import com.fasterxml.jackson.databind.ObjectReader
import com.github.salomonbrys.kodein.instance
import org.junit.Assert
import org.junit.Test

data class PlaybooksDto( val playbooks: RangeMap)

class RangeMapTest {

    @Test
    fun testDeserializer() {

        val kodein = getKodein(getMockRandom())
        val reader : ObjectReader = kodein.instance()

        val input = """
        ---
        playbooks:
        - 2..3, Human
        - >
          4..6, This is a multiline
          string and it will be very awesomely
          confusing

          to use.
        - "7..10, Halfling : string with colon"
        - 11, non-range ints are a-ok
        - 12..15, max of RangeMap will be max of highest range
        - missing range means +1 to last range
        - 17..20, huzzah
        """.trimIndent()

        val dto : PlaybooksDto = reader.forType(PlaybooksDto::class.java).readValue(input)

        Assert.assertEquals(7, dto.playbooks.size)
        Assert.assertEquals(20, dto.playbooks.maxKey)

        Assert.assertEquals(IntRange(2, 20), dto.playbooks.keyRange())

        Assert.assertEquals("Human", dto.playbooks.select(2))
        Assert.assertEquals("missing range means +1 to last range", dto.playbooks.select(16))

        Assert.assertEquals("""
            This is a multiline string and it will be very awesomely confusing
            to use.
        """.trimIndent(), dto.playbooks.select(5))

    }
}
