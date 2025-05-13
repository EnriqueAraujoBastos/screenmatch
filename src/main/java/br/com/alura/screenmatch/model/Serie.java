package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.service.traducao.ConsultaMyMemory;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;


@Entity
@Table(name = "series")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String titulo;
    private Integer totalTemporadas;
    private Double avaliacao;
    @Enumerated(EnumType.STRING)
    private Categoria genero;
    private String atores;
    private String poster;
    private String sinopse;

    @OneToMany(mappedBy = "serie", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Episodio> episodios = new ArrayList<>();


    public Serie(DadosSerie dadosSerie){
        this.titulo = dadosSerie.titulo();
        this.totalTemporadas = dadosSerie.totalTemporadas();
        this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0.0);
        this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
        this.atores = dadosSerie.atores();
        this.poster = dadosSerie.poster();
        this.sinopse = ConsultaMyMemory.obterTraducao(dadosSerie.sinopse()).trim();
    }

    public void setEpisodios(List<Episodio> episodios) {
        episodios.forEach(e -> e.setSerie(this));
        this.episodios = episodios;
    }


    @Override
    public String toString() {
        return  " genero= " + genero +
                ", titulo= '" + titulo + '\'' +
                ", totalTemporadas= " + totalTemporadas +
                ", avaliacao= " + avaliacao +
                ", atores= '" + atores + '\'' +
                ", poster= '" + poster + '\'' +
                ", sinopse= '" + sinopse + '\'' +
                ", episódios= '" + episodios + '\'';
    }
}
