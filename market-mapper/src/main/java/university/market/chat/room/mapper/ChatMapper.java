package university.market.chat.room.mapper;

import java.util.Optional;
import org.apache.ibatis.annotations.Mapper;
import university.market.chat.room.domain.ChatVO;

@Mapper
public interface ChatMapper {
    void createChat(ChatVO chat);

    Optional<ChatVO> getChat(Long chatId);

    void deleteChat(Long chatId);

    void updateChat(Long chatId, String title);

}
