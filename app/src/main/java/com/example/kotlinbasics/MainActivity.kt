package com.example.kotlinbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

//const val x = 1

class MainActivity : AppCompatActivity() {

    private var number : Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    //        -----------------------------------------------------------------------

        var s1 : String = "Hey"
        var i = 1
        var a = 2.7
//
//
        var k = 1
        k = 5
        k = 10

        val x = 5

//        x = 1

//        const val q = 2 // Compile Time and just Global


            var xaa = ""
         xaa = if (true){
            "gamed"
        } else {
            "Ya3m"
        }

//        textView.text = xaa


    //        -----------------------------------------------------------------------

        var s : String? = null

        textView.text = s


/////////////////////////////////////////



        number?.let {
            var aq : Int = it
        }


////////////////////////////////////////


        var ka : String? = null

        ka.let {
            textView.text = it
        }
//
        ka?.let {
            textView.text = it
        }


//
        var o = ka?.let { // return last
            textView.text = "Gamed"

        }


        var le = ka?.also { // return same as object or variable
            textView.text = "Gamed"

        }

/////////////////////////////////////////

        textView.apply {
            text = "Nenezuko chan"
            maxLines = 7
        }

        textView.run {
            text = "Nenezuko chan"
            maxLines = 7

        }
//

        var aintent = Intent().apply { // return same as object or variable
            putExtra("asdas", "asda")
            putExtra("asdas", "asda")
            putExtra("asdas", "asda")
            action = "ahhh"
        }



        var rintent = Intent().run { // return last
            putExtra("asdas", "asda")
            putExtra("asdas", "asda")
            putExtra("asdas", "asda")
            action = "ad"
        }

//        startActivity(aintent)



    //        -----------------------------------------------------------------------

        val str = "Gamed"

        when(str){
            "Baba" -> {
                textView.text = "Baba"
            }

            "Mama" -> textView.text = "Mama"
            "Gamed" -> textView.text = str
        }


        val strr = when(str){
            "Baba" -> "1"
            "Mama" -> "2"
            "Gamed" -> "3"
            else -> "4"
        }

        textView.text = strr


    //        -----------------------------------------------------------------------



        fun firstFun(i : Int , x : String){
            var a = x.substring(1 , 4)
        }

        fun secondFun(x : String) : String{
            var a = x.substring(1 , 4)
            return a
        }

        fun thirdFun(x : String) : String = textView.text.toString()


//
        fun lamda() : String = textView.text.toString()


        var result = {lamda()}  // result now is fun take nothing and retrun string
//
        var ax : (Int) -> (Int) = {i ->
            i * 2
        }
//
        var res : (Int) -> (Int) = { i->
            i * 2
        }
//
        Log.d("gamed" , res(5).toString())
//


//
        first {
            third()
        }
//
                                                                // single abstract method (SAM) is interface has just one method we can implement using SAM Conversion
//                                                              // and convert it to higher order function
//                                                              // in kotlin we can replace callback interfaces with closure (Higher order functions)

        textView.setOnClickListener {
            Toast.makeText(this , "SUIIII" , Toast.LENGTH_LONG).show()
        }

        textView.setOnClickListener {

        }

        ////////////////////////////////////////////////////////////////////////////////////////////


    }











    fun first(i : () -> Unit){
        Log.d("gamed" , "1")
        Log.d("gamed" , "2")
        Log.d("gamed" , "3")

        // first or second
        i()

    }

    fun second(){
        Log.d("gamed" , "4")
        Log.d("gamed" , "5")
        Log.d("gamed" , "6")
        Log.d("gamed" , "7")
    }

    fun third(){
        Log.d("gamed" , "8")
        Log.d("gamed" , "9")
        Log.d("gamed" , "SUIIIII")
    }



}