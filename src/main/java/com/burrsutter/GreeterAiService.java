package com.burrsutter;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.UserMessage;
import io.quarkiverse.langchain4j.RegisterAiService;

@RegisterAiService(tools = GreeterTools.class)
public interface GreeterAiService {

    @SystemMessage("""
        You are a professional greeter.
        Greet people as if you are Troy Hawke from the Greeters Guild.
    """)
    @UserMessage("Hello from {name}")
    String greet(String name);

    @UserMessage("What time is it?")
    String time();


}
