package com.igorbonfim.vuttrapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Tool {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer toolId;

    @NotNull
    @NotEmpty
    @Size(min = 3, max = 255)
    private String title;

    @NotNull
    @NotEmpty
    @Size(min = 5, max = 255)
    private String link;

    @NotNull
    @NotEmpty
    @Size(min = 5, max = 255)
    private String description;

    public Tool(String title, String link, String description) {
        this.title = title;
        this.link = link;
        this.description = description;
    }

    public Integer getToolId() {
        return toolId;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getDescription() {
        return description;
    }

    public void setToolId(Integer toolId) {
        this.toolId = toolId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
