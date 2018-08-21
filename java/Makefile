IMAGE_TAG = gradle-image
VOLUME_PATH = $(PWD)

build:
	docker build -t $(IMAGE_TAG) .

run:
	docker run --rm -it -v $(VOLUME_PATH):/app $(IMAGE_TAG)