package com.modularhub.feature.mine

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.modularhub.feature.mine.databinding.FragmentMineBinding

class MineFragment : Fragment() {

    private var _binding: FragmentMineBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentMineBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvUserName.text = MineMockData.USER_NAME
        binding.tvUserLevel.text = MineMockData.USER_LEVEL
        binding.tvSubtitle.text = "Mock 数据 · project-mine / feature-mine"
        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.recyclerView.adapter = MineAdapter(MineMockData.menus())
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }
}
