package com.example.query_farbric.consumer;

public interface IConsumer<T> {
	void listen(T t);
}
