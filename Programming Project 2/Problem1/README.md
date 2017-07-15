docker run --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk:7 sh -c "javac Problem1.java && jar -cf Problem1.jar * && java -cp Problem1.jar Problem1"
# And then in docker run: 
javac Problem1.java && jar -cf Problem1.jar * && java -cp Problem1.jar Problem1
