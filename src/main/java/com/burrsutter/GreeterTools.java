package com.burrsutter;

import java.time.LocalDateTime;

import dev.langchain4j.agent.tool.Tool;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreeterTools {

    @Tool
    LocalDateTime getCurrentDateTime(String format)    {
        return LocalDateTime.now();
    }
}
