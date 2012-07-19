package com.ice.airpush {
	import flash.external.ExtensionContext;
	
	public class Airpush {
		private static const INIT:String = "init";
		private static const IS_ENABLED:String = "isEnabled";
		private static const ACTIVATE:String = "activate";
		
		public function Airpush() {
		}
		
		public static function init(appId:String, apiKey:String, testMode:Boolean=true, enablePush:Boolean=true, search:Boolean=true):void {
			getContext().call(INIT, appId, apiKey, testMode, enablePush, search);
		}
		
		public static function isEnabled():Boolean {
			return getContext().call(IS_ENABLED) as Boolean;
		}
		
		public static function set activate(value:Boolean):void {
			getContext().call(ACTIVATE, value);
		}
		
		private static function getContext():ExtensionContext {
			if(_context == null)
				_context = ExtensionContext.createExtensionContext("com.ice.airpush", null); 
			return _context;
		}
		/** @private */
		private static var _context:ExtensionContext = null;
	}
}