@echo off
setlocal enabledelayedexpansion
set HOME=%~dp0
cd /d %HOME%
cd ../
set SWC_PATH=%cd%/as/bin
set CONFIG_PATH=%cd%/android
cd /d %HOME%
set ANE_NAME=com.ice.airpush.ane
set NATIVE_INCLUDE_PATH=%HOME%/android
%FLEX_HOME%\bin\adt -package -tsa none -storetype PKCS12 -keystore %HOME%/icestar.p12 -storepass ice@321654 -target ane %ANE_NAME% %CONFIG_PATH%/extension.xml -swc %SWC_PATH%/*.swc -platform Android-ARM -C %NATIVE_INCLUDE_PATH% . 
pause