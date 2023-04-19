#!/usr/bin/bash
	
	javac -cp antlr.jar:fillo.jar:. -d classes src/*.java src-gen/*.java
	java -cp antlr.jar:fillo.jar:classes Main