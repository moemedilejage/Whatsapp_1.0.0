package com.imegga.whatsappdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends RecyclerView.Adapter<ChatAdapter.ChatViewHolder> {

    private Context context;
    private List<Chat> chatList;

    public ChatAdapter() {
    }

    public ChatAdapter(List<Chat> chatList, Context context) {
        this.chatList = chatList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.chat_list_item, parent, false);
        return new ChatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolder holder, int position) {
        Chat chat = chatList.get(position);
        holder.userNames.setText(chat.getFullNames());
        holder.lastChat.setText(chat.getLastChat());
        holder.timeStamp.setText(chat.getTimeStamp());

        Picasso.get().load(chat.getProfileImage())
                .placeholder(R.drawable.rounded_corner)
                .resize(60, 60)
                .into(holder.profileImage);
    }

    @Override
    public int getItemCount() {
        return chatList.size();
    }

    class ChatViewHolder extends RecyclerView.ViewHolder {
        CircleImageView profileImage;

        TextView userNames, lastChat, timeStamp;

        ChatViewHolder(@NonNull View itemView) {
            super(itemView);
            profileImage = itemView.findViewById(R.id.profile_image);
            userNames = itemView.findViewById(R.id.tv_full_name);
            lastChat = itemView.findViewById(R.id.tv_last_msg);
            timeStamp = itemView.findViewById(R.id.tv_time);
        }
    }

}

