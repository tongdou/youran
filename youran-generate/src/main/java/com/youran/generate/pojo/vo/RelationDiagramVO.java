package com.youran.generate.pojo.vo;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 *
 * @author cbb
 * @date 2018/7/17
 */
public class RelationDiagramVO {

    public static final String ONE = "1";
    public static final String MANY = "N";

    private String from;
    private String to;
    private String text;
    private String toText;

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getToText() {
        return toText;
    }

    public void setToText(String toText) {
        this.toText = toText;
    }
}