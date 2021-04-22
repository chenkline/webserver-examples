# $GRAALVM_HOME/bin/native-image -cp ./target/VertServer.jar -H:Name=VertServer -H:Class=example.ExampleApp -H:+ReportUnsupportedElementsAtRuntime --allow-incomplete-classpath

%GRAALVM_HOME%/bin/native-image -cp ./target/VertServer.jar -H:Name=VertServer -H:Class=example.ExampleApp -H:+ReportUnsupportedElementsAtRuntime --allow-incomplete-classpath