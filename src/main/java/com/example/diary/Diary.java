package com.example.diary;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
// @Table(name = "diary")	//指定しないと生成されるテーブルはクラス名と同じdiary
public class Diary {
    public Diary(String bodytext, LocalDateTime createDatetime) {
        this.bodytext = bodytext;
        this.createDatetime = createDatetime;
    }

    @Id
    @Column(nullable = false)
    private Integer id;

    @Column(nullable = false)
    private String bodytext;

    @Column(name = "create_datetime", nullable = false)
    private LocalDateTime createDatetime;

}