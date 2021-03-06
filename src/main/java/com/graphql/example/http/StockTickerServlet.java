package com.graphql.example.http;

import org.eclipse.jetty.websocket.servlet.WebSocketServlet;
import org.eclipse.jetty.websocket.servlet.WebSocketServletFactory;

/**
 * In Jetty this is how you map a servlet to a websocket per request
 */
public class StockTickerServlet extends WebSocketServlet {
    @Override
    public void configure(WebSocketServletFactory factory) {
        factory.getPolicy().setMaxTextMessageBufferSize(1024 * 1024);
        factory.getPolicy().setIdleTimeout(30 * 1000);
        factory.register(StockTickerWebSocket.class);
    }
}


