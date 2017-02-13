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

package org.stevesea.adventuresmith

import android.support.v7.widget.*
import android.view.*
import android.widget.*
import com.mikepenz.fastadapter.items.*
import com.mikepenz.fastadapter.utils.*
import org.stevesea.adventuresmith.core.*
import java.util.*

class GeneratorButton(val generator: Generator,
                      locale: Locale = Locale.US,
                      val meta : GeneratorMetaDto = generator.getMetadata(locale)) :
        AbstractItem<GeneratorButton, GeneratorButton.ViewHolder>() {
    init {
        withIdentifier(generator.getId().hashCode().toLong())
    }
    val name = meta.name

    override fun getType(): Int {
        return R.id.btn_card
    }

    override fun getLayoutRes(): Int {
        return R.layout.button_grid_item
    }

    override fun bindView(holder: ViewHolder?, payloads: MutableList<Any?>?) {
        super.bindView(holder, payloads)

        holder!!.btnText.text = htmlStrToSpanned(name)

        if (meta.inputParams.size > 0) {
            holder!!.lowerLayout.visibility = View.VISIBLE
            holder!!.btnTextLower.text = "here is some text!"
        } else {
            holder!!.lowerLayout.visibility = View.GONE
            holder!!.btnTextLower.text = ""
        }
    }

    class ViewHolder(v: View?) : RecyclerView.ViewHolder(v) {
        val btnText =  v!!.findViewById(R.id.btn_txt) as TextView
        val btnTextLower = v!!.findViewById(R.id.btn_txt_lower) as TextView
        val lowerLayout = v!!.findViewById(R.id.btn_lower) as LinearLayout
    }

    override fun getFactory(): ViewHolderFactory<out ViewHolder> {
        return Factory
    }
    companion object Factory : ViewHolderFactory<ViewHolder> {
        override fun create(v: View?): ViewHolder {
            return ViewHolder(v)
        }
    }
}
