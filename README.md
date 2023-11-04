# Engenharia de Software 3 - Design Patterns Facade
<p>Usando as classes abaixo como modelo, implemente uma classe “Combo” seguindo o design pattern “Facade”. A classe implementada por você deverá ter um método que permita facilmente a criação de “combos” que incluam um sanduiche (burguer), uma sobremesa e bebida do “combo”. Deverá também ter um método para mostrar quais são os itens do “combo”. Se julgar necessário crie outras classes auxiliares.</p>

![image](https://github.com/matheusromeiro/Design_Patterns_Facade/assets/65318621/d1d1087d-1b54-44a2-a33c-32bd7054ce99)

### Para testar a sua implementação utilize o código abaixo:

```
import java.util.Scanner; 
 
public class Main { 
    public static void main(String[] args) { 
        System.out.println("Selecione seu combo"); 
        System.out.println("1. Combo Master"); 
        System.out.println("2. Super Combo"); 
        System.out.print("Sua escolha: "); 
 
        Scanner input = new Scanner(System.in); 
 
        int tipo = input.nextInt(); 
        Combo combo = new Combo(); 
        combo.CriarCombo(tipo); 
        System.out.println(combo); 
    } 
} 
```

### O QUE VOCÊ DEVE ENTREGAR
<p>Como resposta a esta tarefa você deve fornecer um link para um repositório público no GitHub criado por você, que contenha a sua implementação para resolução do problema proposto.</p>
