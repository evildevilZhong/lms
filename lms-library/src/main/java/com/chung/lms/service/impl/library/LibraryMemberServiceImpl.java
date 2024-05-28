package com.chung.lms.service.impl.library;

import com.chung.lms.mapper.LibraryMemberMapper;
import com.chung.lms.model.LibraryMember;
import com.chung.lms.model.LibraryMemberExample;
import com.chung.lms.service.LibraryMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * 图书馆会员service实现类
 */
@Service
public class LibraryMemberServiceImpl implements LibraryMemberService {

    @Autowired
    LibraryMemberMapper memberMapper;

    @Override
    public LibraryMember getMemberByBarCode(String barCode) {
        LibraryMemberExample example = new LibraryMemberExample();
        example.createCriteria().andBarcodeEqualTo(barCode);
        List<LibraryMember> members = memberMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(members)) {
            return null;
        }

        return members.get(0);
    }

    @Override
    public LibraryMember getMemberByUmsId(Long umsId) {
        LibraryMemberExample example = new LibraryMemberExample();
        example.createCriteria().andUmsIdEqualTo(umsId);
        List<LibraryMember> members = memberMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(members)) {
            return null;
        }

        return members.get(0);
    }

    @Override
    public void updateMemberByMemberId(LibraryMember libraryMember) {
        memberMapper.updateByPrimaryKey(libraryMember);
    }
}
