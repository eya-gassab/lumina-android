package com.eyagassab.lumina.data;

import java.util.ArrayList;
import java.util.List;

public final class SampleData {

    private SampleData() {
    }

    public static List<Concept> getConcepts() {
        List<Concept> concepts = new ArrayList<>();

        concepts.add(new Concept(
                1,
                "Principe de Pareto",
                "Une minorité de causes produit la majorité des résultats. Le ratio 80/20 est une approximation, pas une loi exacte.",
                "Avant de réviser, repère les 20 % de chapitres qui concentrent le plus de points à l'examen et commence par eux."));

        concepts.add(new Concept(
                2,
                "Rasoir d'Ockham",
                "Entre deux explications qui rendent compte des faits aussi bien l'une que l'autre, préfère celle qui suppose le moins d'hypothèses.",
                "Quand un bug a plusieurs causes possibles, teste d'abord l'hypothèse la plus simple, comme une faute de frappe ou une configuration, avant de soupçonner le framework."));

        // TEMPORAIRE : test de stress, à supprimer après l'E10
        concepts.add(new Concept(
                4,
                "Le théorème de l'impossibilité des compromis dans les systèmes complexes et adaptatifs",
                "Dans un système où chaque amélioration locale dégrade un autre indicateur, il est impossible d'optimiser tous les critères à la fois, et il faut donc choisir explicitement ce que l'on sacrifie pour éviter de subir des arbitrages cachés et imprévisibles.",
                "Avant de lancer un projet, écris sur une feuille les trois critères qui comptent vraiment (coût, délai, qualité), classe-les du plus important au moins important, puis décide à l'avance lequel tu accepteras de dégrader si un imprévu arrive, afin de ne pas trancher dans la panique au dernier moment."));
        concepts.add(new Concept(
                3,
                "Biais de confirmation",
                "Nous cherchons et retenons plus facilement les informations qui confirment ce que nous croyons déjà.",
                "Avant de valider une idée, cherche volontairement un argument ou une source qui la contredit, puis compare les deux honnêtement."));

        return concepts;
    }
}