package com.example.prac7a 
import android.media.MediaPlayer 
import androidx.appcompat.app.AppCompatAcƟvity
import android.os.Bundle 
import android.widget.BuƩon
class MainAcƟvity: AppCompatAcƟvity(){
 override fun onCreate(savedInstanceState: Bundle?){ 
 super.onCreate(savedInstanceState) 
 setContentView(R.layout.acƟvity_main) 
 //createaninstanceofmediplayerforaudioplayback 
 val mediaPlayer: MediaPlayer=MediaPlayer.create(applicaƟonContext,R.raw.music) 
 //registerallthebuƩonsusingtheirappropriateIDs
 val bPlay: BuƩon=findViewById(R.id.playBuƩon) 
 val bPause: BuƩon=findViewById(R.id.pauseBuƩon) 
 val bStop: BuƩon=findViewById(R.id.stopBuƩon) 
 //handlethestartbuƩonto
 //starƩheaudioplayback
 bPlay.setOnClickListener{ 
 //startmethodisusedtostart 
 //playingtheaudiofile 
 mediaPlayer.start() 
 } 
 //handlethepausebuƩontopuƩhe
 //MediaPlayerinstanceaƩhePausestate
 bPause.setOnClickListener{ 
 //pause()methodcanbeusedto 
 //pausethemediaplyerinstance 
 mediaPlayer.pause() 
 } 
 //handlethestopbuƩontostopplaying
 //andpreparethemediaplayerinstance 
 //forthenexƟnstanceofplay
 bStop.setOnClickListener{ 
 //stop()methodisusedtocompletely 
 //stopplayingthemediaplayerinstance 
 mediaPlayer.stop() 
 //aŌerstoppingthemediaplayerinstance
 //iƟsagainneedtobeprepared
 //forthenexƟnstanceofplayback
 mediaPlayer.prepare() 
 } 
 } 
} 
