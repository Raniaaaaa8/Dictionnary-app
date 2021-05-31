package com.example.exo6

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        //get from intent
        textView.text= intent.extras?.get("mot").toString()
        val img=intent.extras?.get("img")

        //prononciation sound
        var mediaplayer : MediaPlayer? = null
        if (img=="animal.png") {
            imageView.setImageDrawable(resources.getDrawable(R.drawable.animal, theme))
            mediaplayer= MediaPlayer.create(this,R.raw.animal)
            //video
            val mediacontroller = MediaController(this)
            mediacontroller.setAnchorView(videoView)
            val onlineUri = Uri.parse("https://r2---sn-a5meknzk.googlevideo.com/videoplayback?expire=1622449979&ei=20q0YOOZNoia1gKn8L2oAg&ip=103.36.33.119&id=o-AGr5SERY8kweQAVsZQszABtxm-IobDeFg75XY3-UyhbM&itag=18&source=youtube&requiressl=yes&vprv=1&mime=video%2Fmp4&ns=-XN7LGbOxTdar80aFuW_2GIF&gir=yes&clen=194228&ratebypass=yes&dur=5.874&lmt=1616758601680397&fexp=24001373,24007246&c=WEB&txp=6310222&n=BySma1jFbhmLzIOo&sparams=expire%2Cei%2Cip%2Cid%2Citag%2Csource%2Crequiressl%2Cvprv%2Cmime%2Cns%2Cgir%2Cclen%2Cratebypass%2Cdur%2Clmt&sig=AOq0QJ8wRQIgPHaZFkLoVd6pR8WnyIMIanWxuXXaIxW6pv5ESnyK57ICIQCrRWS74F6fdhw7M3OyIOv-idE5iGzRbVUm5cca97EsRQ%3D%3D&rm=sn-jx25uoxu-jb3z7l&req_id=12c4fbe0f59ba3ee&ipbypass=yes&redirect_counter=2&cm2rm=sn-npozy7l&cms_redirect=yes&mh=Kh&mip=41.220.147.73&mm=34&mn=sn-a5meknzk&ms=ltu&mt=1622427931&mv=D&mvi=2&pl=0&lsparams=ipbypass,mh,mip,mm,mn,ms,mv,mvi,pl&lsig=AG3C_xAwRQIgJciB5okQx2sk-ocIqN0gjceQIl5apaZW67JJbnGp_1ECIQCJuvjvSzSQbMcgqxV17jO9c2HGudlN9bA1m96gCf9qIQ%3D%3D")
            val offlineUri:Uri= Uri.parse("android.resource://$packageName/${R.raw.videoplayback}")
            videoView.setMediaController(mediacontroller)
            videoView.setVideoURI(offlineUri)
            videoView.requestFocus()
            videoView.start()
        }
        if (img=="family.jpg"){
            imageView.setImageDrawable(resources.getDrawable(R.drawable.family, theme))
            mediaplayer= MediaPlayer.create(this,R.raw.family)

        }

        //play sound
        textView.setOnClickListener {

            if (mediaplayer != null) {
                mediaplayer.start()
            }
        }
    }
}