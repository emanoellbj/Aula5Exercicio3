import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Time A", 10);
        scores.put("Time B", 15);
        scores.put("Time C", 8);
        scores.put("Time D", 12);

        String timeMaiorPontuacao = getTeamWithHighestScore(scores);
        System.out.println(timeMaiorPontuacao);
        
	}
	
    public static String getTeamWithHighestScore(Map<String, Integer> scores) {
        String timeMaiorPontuacao = null;
        int maiorPontuacao = Integer.MIN_VALUE;

        // Percorre o mapa de pontuações para encontrar o time com a maior pontuação
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String time = entry.getKey();
            int pontuacao = entry.getValue();

            if (pontuacao > maiorPontuacao) {
            	maiorPontuacao = pontuacao;
                timeMaiorPontuacao = time;
            }
        }

        return timeMaiorPontuacao;
    }
}
