package list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
	//atributo lista tarefa
	private List<Tarefaa> tarefaList;

	public ListaTarefa() {
		this.tarefaList = new ArrayList<>();
	}
	
	public void adicionarTarefa(String descricao) {
		tarefaList.add(new Tarefaa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		List<Tarefaa> tarefasParaRemover = new ArrayList<>();
		for(Tarefaa t : tarefaList) {
			if(t.getDescricao().equalsIgnoreCase(descricao)) {
				tarefasParaRemover.add(t);
			}
		}
		tarefaList.removeAll(tarefasParaRemover);
	}
	
	public int obterNumeroTotalTarefas() {
		return  tarefaList.size();
	}
	
	public void obterDescricaoTarefas() {
		System.out.println(tarefaList);
	}

	public static void main(String[] args) {
		ListaTarefa listaTarefa = new ListaTarefa();
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
		System.out.println();
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 1");
		listaTarefa.adicionarTarefa("Tarefa 2");
		System.out.println();
		listaTarefa.obterDescricaoTarefas();
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
	
		listaTarefa.removerTarefa("Tarefa 2");
		System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
	}
}
