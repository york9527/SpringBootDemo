package com.coderyu.springboottest.mappers;

import com.coderyu.springboottest.model.Note;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.SelectKey;

public interface NoteMapper {
    @Insert("insert into users(name,email) values(#{name},#{email})")
    @SelectKey(statement = "call identity()", keyProperty = "id",
            before = false, resultType = Integer.class)
    public Integer insertNote(Note note);
}
