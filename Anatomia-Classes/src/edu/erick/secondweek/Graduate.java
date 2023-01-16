package edu.erick.secondweek;
public class Graduate {
    
public static void main(String[] args) {
    Integer noteStudent_1 = 6;
    Integer noteStudent_2 = 7;

    Integer avg = calculateNote(noteStudent_1, noteStudent_2);
    String situationStudente = "";
    if (avg >= 7)
        situationStudente = "Aprovado";
    else
    situationStudente = "Reprovado";

    System.out.print("O aluno conseguiu a nota: " + avg + " e sua situação é: " + situationStudente);
}

public static Integer calculateNote (Integer note_1, Integer note_2){
    return (note_1 + note_2) / 2; 
}

}
