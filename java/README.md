# Java Katas

Katas done using Java and Test Driven Development (TDD).

## Dockerfile and Makefile
Practiced creating a Dockerfile and Makefile to create the development environment.

- `make build` runs the docker build command to build an image based on the Dockerfile. The image installs gradle, used to create the kata projects.
- `make run` runs the process in a isolated contained derived from the image built with `make build`.

## Running Tests
To run a test:
1. Run `make build` in the terminal/console
2. Run `make run` in the terminal/console
3. cd to the desired kata e.g. `cd queues`
4. Run `gradle test`

## [Linked_lists](https://github.com/KDvu/katas/tree/master/java/linked_lists)
- Non-generic immutable linked list
- JUnit 4

## [Stacks](https://github.com/KDvu/katas/tree/master/java/stacks)
- Non-generic Stack/Singly Linked List/Node classes
- Uses different linked list implementation than the linked list kata
- JUnit 4

## [Generic Queue](https://github.com/KDvu/katas/tree/master/java/queues)
- Generic Queue/Doubly Linked List/Node classes
- Uses different linked list implementation than the linked list kata
- JUnit 5

## [Binary Tree and Tree Traversal](https://github.com/KDvu/katas/tree/master/java/binary_trees)
- Non-generic binary tree 
- Depth-First Searches (In-order, Pre-order and Post-order)
- Breath-First Search
- JUnit 5