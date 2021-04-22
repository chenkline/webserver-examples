# $GRAALVM_HOME/bin/native-image -cp ./target/webfluxServer.jar -H:Name=webfluxServer -H:Class=hello.JavaHello -H:+ReportUnsupportedElementsAtRuntime --allow-incomplete-classpath

$GRAALVM_HOME/bin/native-image -cp ./target/webfluxServer.jar -H:Name=webfluxServer -H:Class=hello.JavaHello -H:+ReportUnsupportedElementsAtRuntime --allow-incomplete-classpath