package cubex.mahesh.fragment_dec7am

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.header.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var fManager = supportFragmentManager
        home.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,HomeFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        courses.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,CoursesFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        projects.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,ProjectsFragment())
            tx.addToBackStack("true")
            tx.commit()
        }
        materials.setOnClickListener {
            var tx = fManager.beginTransaction()
            tx.replace(R.id.frag1,MaterialsFragment())
            tx.addToBackStack("true")
            tx.commit()
        }

    }
}
