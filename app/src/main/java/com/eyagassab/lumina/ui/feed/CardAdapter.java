package com.eyagassab.lumina.ui.feed;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.eyagassab.lumina.data.Concept;
import com.eyagassab.lumina.databinding.ItemCardBinding;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    private final List<Concept> concepts;

    public CardAdapter(List<Concept> concepts) {
        this.concepts = concepts;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemCardBinding binding = ItemCardBinding.inflate(
                LayoutInflater.from(parent.getContext()), parent, false);
        return new CardViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        Concept concept = concepts.get(position);
        holder.binding.tvConcept.setText(concept.getTitle());
        holder.binding.tvTldr.setText(concept.getTldr());
        holder.binding.tvPractice.setText(concept.getPractice());
    }

    @Override
    public int getItemCount() {
        return concepts.size();
    }

    static class CardViewHolder extends RecyclerView.ViewHolder {
        final ItemCardBinding binding;

        CardViewHolder(@NonNull ItemCardBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}