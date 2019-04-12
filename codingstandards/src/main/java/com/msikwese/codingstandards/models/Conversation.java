package com.msikwese.codingstandards.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Conversation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @NotNull
    private long id;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    @NotNull
    private Chat chat;


    @ManyToOne
    @JoinColumn(name = "reply_to_id")
    private Conversation replyTo;

    @OneToMany(mappedBy = "replyTo")
    private List<Conversation> replies;

    // isFromCustomer: false if message is from Staff.
    // In an ideal situation we should be holding a pointer to the
    // particular Customer or Staff sending the message.
    private Boolean isFromCustomer;

    @NotNull
    private String content;

    public long getId() {
        return id;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public Conversation getReplyTo() {
        return replyTo;
    }

    public void setReplyTo(Conversation replyTo) {
        this.replyTo = replyTo;
    }

    public List<Conversation> getReplies() {
        return replies;
    }

    public void setReplies(List<Conversation> replies) {
        this.replies = replies;
    }

    public Boolean getFromCustomer() {
        return isFromCustomer;
    }

    public void setFromCustomer(Boolean fromCustomer) {
        isFromCustomer = fromCustomer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
