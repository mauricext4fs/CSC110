docker run -it --rm -v "$PWD":/usr/src/myapp -w /usr/src/myapp openjdk:7 /bin/bash
# And then in docker run: 
javac Problem2.java && jar -cf Problem2.jar * && java -cp Problem2.jar Problem2
