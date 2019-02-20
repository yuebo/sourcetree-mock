#!/usr/bin/env bash
rm -f *.jar
mvn clean install -f ../pom.xml -P sit -Dmaven.test.skip=true
cp ../target/app.jar app.jar
docker build . -t mooncakexyb/sourcetree-mock:latest