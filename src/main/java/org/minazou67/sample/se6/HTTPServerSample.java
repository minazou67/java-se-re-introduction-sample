package org.minazou67.sample.se6;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

public class HTTPServerSample {

	// HttpHandler の実装クラス
	static class SampleHandler implements HttpHandler {
		public void handle(HttpExchange exchange) throws IOException {
			String response = "Hello World";
			exchange.sendResponseHeaders(200, response.length());
			OutputStream ost = exchange.getResponseBody();
			ost.write(response.getBytes());
			ost.close();
		}
	}
	public static void main(String[] args) throws IOException {
		HttpServer server = HttpServer.create(new InetSocketAddress(8000), 0);
		server.createContext("/sample", new SampleHandler());
		server.setExecutor(null);
		server.start();
	}
}
