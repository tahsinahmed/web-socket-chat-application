package com.exercise.websocket.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class WebSocketChatMessage {
    private String type;
    private String content;
    private String sender;
}
