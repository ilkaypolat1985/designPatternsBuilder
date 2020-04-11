package com.asd.designpatterns.builder;

public class Email {
    private final String subject;
    private final String recipient;
    private final String content;

    private Email(Builder builder) {
        this.subject = builder.subject;
        this.recipient = builder.recipient;
        this.content = builder.content;
    }

    public String getSubject() {
        return subject;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Email{" +
                "subject='" + subject + '\'' +
                ", recipient='" + recipient + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    public static class Builder{
        private String subject;
        private String recipient;
        private String content;

        public Builder subject(String subject){
            this.subject = subject;
            return this;
        }

        public Builder recipient(String recipient){
            this.recipient = recipient;
            return this;
        }

        public Builder content(String content){
            this.content = content;
            return this;
        }

        public Email build(){
            return new Email(this);
        }
    }
}
