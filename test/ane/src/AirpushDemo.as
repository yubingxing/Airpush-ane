package
{
	import com.ice.airpush.Airpush;
	
	import flash.display.Sprite;
	import flash.display.StageAlign;
	import flash.display.StageScaleMode;
	import flash.text.TextField;
	
	public class AirpushDemo extends Sprite {
		public function AirpushDemo() {
			super();
			
			// 支持 autoOrient
			stage.align = StageAlign.TOP_LEFT;
			stage.scaleMode = StageScaleMode.NO_SCALE;
			
			var appId:String = "61125";
			var apiKey:String = "1342596474108988781";
			var text:TextField = new TextField;
			text.textColor = 0xff0000;
			text.text = Airpush.isEnabled() + "";
			addChild(text);
			if(Airpush.isEnabled()){
				Airpush.init(appId, apiKey, true);
				Airpush.activate = true;
			}
		}
	}
}