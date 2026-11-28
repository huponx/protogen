GO ?= go

.PHONY: help tidy

help:
	@printf '%s\n' 'tidy    go mod tidy'

tidy:
	GOWORK=off $(GO) mod tidy
