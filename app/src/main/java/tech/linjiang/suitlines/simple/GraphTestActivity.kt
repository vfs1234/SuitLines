package tech.linjiang.suitlines.simple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_graph_test.*
import tech.linjiang.suitlines.Unit

class GraphTestActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graph_test)
        var lines = ArrayList<Unit>()
        lines.add(Unit(0f, "1"))
        lines.add(Unit(0f, "2"))
        lines.add(Unit(0f, "3"))
        lines.add(Unit(0f, "4"))
        lines.add(Unit(0f, "5"))
        lines.add(Unit(0f, "6"))
        lines.add(Unit(0f, "7"))
//        suitlines.setDefaultOneLineColor(resources.getColor(com.youdao.robolibrary.R.color.color_line_graph), resources.getColor(com.youdao.robolibrary.R.color.color_line_graph_cover1), resources.getColor(com.youdao.robolibrary.R.color.color_line_graph_cover2))
        suitlines.feed(lines)
    }
}
