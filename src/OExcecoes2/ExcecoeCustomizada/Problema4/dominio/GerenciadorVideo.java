package OExcecoes2.ExcecoeCustomizada.Problema4.dominio;

public class GerenciadorVideo {
    int videosPostadosHoje = 0;

    public void postarShort(String nomeVideo, String formato) {
        if (!formato.equals("9:16")) {
            throw new FormatoInvalidoException("O vídeo " + nomeVideo + " deve estar no formato vertical 9:16!");
        }
        if (videosPostadosHoje > 3) {
            throw new LimiteDeUploadExcedidoException("Limite diário de vídeos postados excedido! Você já postou " + videosPostadosHoje + " vídeos hoje.");
        }
        this.videosPostadosHoje++;
        System.out.println("Shorts '" + nomeVideo + "' postado com sucesso no canal de Rankings! 🚀");
        System.out.println("Total de Shorts postados hoje: " + this.videosPostadosHoje + "/3");
        System.out.println("--------------------------------------------------\n");
    }

    public int getVideosPostadosHoje() {
        return videosPostadosHoje;
    }

}
