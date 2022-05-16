@echo on
set PATH=%PATH%;"C:\ksingh\protoc-3.19.4-win64\bin"

@set BUILD_ROOT=c:\ksingh\KafkaToolPlugin\src\main
@set PROTO_PATH=%BUILD_ROOT%\resources\proto

for /f %%f in ('dir /b %PROTO_PATH%\*.proto') do @protoc --proto_path=%PROTO_PATH% --java_out=. %%f
@if errorlevel 1 exit /b %errorlevel%