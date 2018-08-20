var cvs=document.getElementById("canvas");
var ctx=cvs.getContext("2d");

var bg=new image();
bg.src="N:\WS\FlappyBird\images\bg.png";

function draw(){
	ctx.drawImage(bg,0,0);
}
draw();