package com.imegga.whatsappdemo;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentChats#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentChats extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentChats() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentB.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentChats newInstance(String param1, String param2) {
        FragmentChats fragment = new FragmentChats();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    List<Chat> chatList;
    Chat chat;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_chats, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.chats_recycler_view);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);



        chatList = new ArrayList();

        chat = new Chat(R.drawable.name_name,
                "Name Name",
                "Hello",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.pic2,
                "Name Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.name_name,
                "515Tex Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.name_name,
                "515Tex Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.name_name,
                "515Tex Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.name_name,
                "515Tex Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.name_name,
                "515Tex Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        chat = new Chat(R.drawable.name_name,
                "515Tex Name222",
                "11:20",
                "uhsadfk");
        chatList.add(chat);

        ChatAdapter adaptor = new ChatAdapter(chatList, getContext());
        recyclerView.setAdapter(adaptor);

        return view;

    }
}