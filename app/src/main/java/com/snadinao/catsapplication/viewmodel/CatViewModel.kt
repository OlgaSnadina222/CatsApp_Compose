package com.snadinao.catsapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.snadinao.catsapplication.R
import com.snadinao.catsapplication.model.CatData

class CatViewModel(): ViewModel(){

    val catsList: MutableLiveData<List<CatData>> by lazy {
        MutableLiveData<List<CatData>>()
    }
    private var catList: ArrayList<CatData>
    init {
        catList = ArrayList()
        getCatsList()

    }

    private fun getCatsList() {
        fetchList()
        catsList.value = catList
    }

    private fun fetchList() {
        catList.add(CatData(R.drawable.aaron, "Aaron", "He is moderately active and loves attention from friends and family.  He will love to sleep under covers or any other warm and cozy spot."))
        catList.add(CatData(R.drawable.bale, "Bale", "The fact that this cat is slender and agile is not the only thing that makes him look like a dog.  He also enjoys fetching games."))
        catList.add(CatData(R.drawable.buffy, "Buffy", "This smart cat enjoys puzzles and games that challenge his intelligence. He is not too vocal but will certainly let you know how he feels through meowing and purring."))
        catList.add(CatData(R.drawable.charley, "Charley", "This cat is a very active one. He loves to climb to heights. To this cat, the higher, the better. He's very intelligent cat that love to play and have fun. It sometimes seems like he never sleeps. He is very active and needs to be constantly exercised."))
        catList.add(CatData(R.drawable.clark, "Clark", "These cats are very vocal and they will vividly express themselves. They make a good combination of cats that likes to be around their family but that are also independent."))
        catList.add(CatData(R.drawable.dalia, "Dalia", "They enjoy spending time on their owner´s lap and do not enjoy being left alone for too long."))
        catList.add(CatData(R.drawable.ema, "Ema", "They can get along with humans and other animals pretty well. He is a very intelligent cat, ranked at the top high. He has a good nature, great humor, and lots of energy."))
        catList.add(CatData(R.drawable.ford, "Ford", "He loves playing in the water and you might find him in your pool or thumb. If you have an aquarium, you must know that fish are not safe."))
        catList.add(CatData(R.drawable.gerad, "Gerad", "He will use this soft voice to remind you when it is time for dinner or some petting time at the couch. He loves to be held by you in your arms."))
        catList.add(CatData(R.drawable.hector, "Hector", "Once you get a look at that “Chesire” smile, he will conquer you with their love. They are quite social cats and pretty talkative."))
        catList.add(CatData(R.drawable.joy, "Joy", "He has a sweet and soft voice that he enjoys sharing in a conversation. If you want to have company all the time and don´t mind privacy, this is the cat for you. He will follow you everywhere."))
        catList.add(CatData(R.drawable.kale, "Kale", "They will develop a strong bond with their human owners and follow them everywhere. As social as they are, they will do great around other dogs and especially if they are raised together."))
        catList.add(CatData(R.drawable.london, "London", "You will usually find this curious cat roaming around the house. He is very easy-going with children and other pets."))
        catList.add(CatData(R.drawable.danny, "Danny", "A gentle paw touch on everything they want to investigate testifies of their sense of curiosity."))
    }
}