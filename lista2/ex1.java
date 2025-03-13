import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Entre com um número: ");
            if (in.nextInt() % 2  == 0) {
                System.out.println("O número é par.");
            } else {
                System.out.println("O número é impar.");
            }
        }
    }
}

/*
struct tat{
	int tempo,cod;
};
typedef struct tat tAtleta;
void obtemAtleta(int num,  tAtleta *atleta){

printf("\nDigite o código do %dº atleta:",num);
	scanf("%i",& (*atleta).cod);  // (*atleta).cod   pode ser escrito como atleta->cod
	
	printf("\nDigite o tempo do %dº atleta:",num);
	scanf("%i",&atleta->tempo);
	return;
}

tAtleta leAtleta(int num){
	tAtleta atleta;
printf("\nDigite o código do %dº atleta:",num);
	scanf("%i",&atleta.cod);
	
	printf("\nDigite o tempo do %dº atleta:",num);
	scanf("%i",&atleta.tempo);
	return atleta;
}
int main(void) {
	tAtleta vAtletas[TAM];

	int tempo_horas, tempo_minutos;
	int maiorTempo = -1, qtMaior= 0, contador, op;
	
    
    for(contador=0;contador<TAM;contador++){
        //atleta=leAtleta(contador+1);
        obtemAtleta(contador+1, &vAtletas[contador]);

	 horario(vAtleta[contador].tempo,&tempo_horas, &tempo_minutos);
	 printf("\nTempo do %dº atleta foi %02i:%02ih", contador + 1, tempo_horas,tempo_minutos);

	}

	return 0;
}

int divisaoInteira(int dividendo, int divisor, int* quoc, int*resto){
    
    if (divisor==0)
        if (dividendo==0)
            return -1;
        else
            return 0;
    else{
        *quoc= dividendo/divisor;
        *resto=dividendo%divisor;
        return 1;
    }
    
}
void horario(int tempo, int *horas, int *minutos) {
	divisaoInteira(tempo,60, horas,minutos);
	return;
}
*/