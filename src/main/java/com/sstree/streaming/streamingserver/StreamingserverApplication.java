package com.sstree.streaming.streamingserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class StreamingserverApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(StreamingserverApplication.class, args);
//
//		FfmpegHls ffmpegHls = new FfmpegHls();
//
//		ffmpegHls.hlsStream();
	}

}
