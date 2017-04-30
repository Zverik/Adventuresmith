/*
 * Copyright (c) 2017 Steve Christensen
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

package org.stevesea.adventuresmith.generator


fun titleCase(input: String) : String {

    val DELIMITERS = setOf<Char>(' ', '\'', '-', '(', ')')

    val sb = StringBuilder()
    var capNext = true

    for (inc in input.toCharArray()) {
        val c = if (capNext)
            Character.toUpperCase(inc)
        else
            Character.toLowerCase(inc)
        sb.append(c)
        capNext = DELIMITERS.contains(c)
    }
    return sb.toString()
}