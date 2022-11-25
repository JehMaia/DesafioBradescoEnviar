package tech.ada.challenge.StatusCartao.servico;

import org.springframework.stereotype.Service;
import tech.ada.challenge.StatusCartao.resposta.RespostaCartao;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service //incluido por Jessica conforme orientado em mentoria

public class ListarCartaoServico {
    public List<RespostaCartao> executar() {
        List<RespostaCartao> respostaCartao = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            RespostaCartao respostaCartao1 = new RespostaCartao();
            respostaCartao1.setStatusCartao(UUID.randomUUID().toString());
            respostaCartao1.add(respostaCartao1);
        }
        return respostaCartao;
    }

}

