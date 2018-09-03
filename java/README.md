# Java Katas

Katas done using Java and Test Driven Development (TDD).

## Dockerfile and Makefile
Practiced creating a Dockerfile and Makefile to create the development environment.

- `make build` runs the docker build command to build an image based on the Dockerfile. The image installs gradle, used to create the kata projects.
- `make run` runs the process in a isolated contained derived from the image built with `make build`.

## [Linked_lists](https://github.com/KDvu/katas/tree/master/java/linked_lists)
- Non-generic immutable linked list
- JUnit4

## [Stacks](https://github.com/KDvu/katas/tree/master/java/stacks)
- Non-generic Stack/Singly Linked List/Node classes
- Uses different linked list implementation than the linked list kata
- JUnit4

## [Generic Queue](https://github.com/KDvu/katas/tree/master/java/queues)
- Generic Queue/Doubly Linked List/Node classes
- Uses different linked list implementation than the linked list kata
- JUnit5