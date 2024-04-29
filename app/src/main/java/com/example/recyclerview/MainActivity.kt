package com.example.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        binding = ActivityMainBinding.inflate(layoutInflater)

        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val player = ArrayList<Player>()

        player.add(Player("leonel Messi", "Messi was born on 24 June 1987 in Rosario, Santa Fe,[13] the third of four children of Jorge Messi, a steel factory manager, and his wife Celia , who worked in a magnet manufacturing workshop. On his father's side, he is of Italian and Spanish descent,", R.drawable.messi))
        player.add(Player("Cristiano Ronaldo", "Cristiano Ronaldo dos Santos Aveiro was born on 5 February 1985 in the São Pedro parish of Funchal, the capital of the Portuguese island of Madeira, and grew up in the nearby parish of Santo António.[11][12] He is the fourth and youngest child of Maria Dolores dos Santos Viveiros da Aveiro", R.drawable.ronaldo))
        player.add(Player("Neymar JR", "He was born in  das , São Paulo, to  Santos Sr. and Nadine da Silva and had a Christian upbringing.[18][19] He inherited his name from his father, who is a former footballer and became his son's advisor as  talents began to grow", R.drawable.neymar))
        player.add(Player("Paulo Dybala", "Dybala was born in Laguna , Córdoba, Argentina.[6] His grandfather, was from the village of  in Poland; he fled from his country of birth to Argentina during ", R.drawable.dibala))
        player.add(Player("Mesut Özil", "Özil[10] was born on 15 October 1988[11] in Gelsenkirchen, North Rhine-Westphalia, as a son of Turkish immigrants.[12] His grandfather moved as a Gastarbeiter from Zonguldak, ", R.drawable.ozil))

        binding.recyclerView.adapter = PlayerAdapter(player)

        }
    }
