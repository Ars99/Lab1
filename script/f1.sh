javac -sourcepath src -d bin -classpath src/com/gr/META-INF/commons-codec-1.8.jar src/com/gr/Main.java src/com/gr/InteractiveMode.java src/com/gr/HashSum.java src/com/gr/Mode.java

mkdir lib
cd lib
jar -xvf ~/Main/src/com/gr/META-INF/commons-codec-1.8.jar org/
cd ..
cp -r bin/* lib/
jar -cef com.gr.Main Main.jar -C lib .
rm -r lib
