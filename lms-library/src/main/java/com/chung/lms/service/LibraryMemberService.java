package com.chung.lms.service;

import com.chung.lms.model.LibraryMember;

/**
 * 图书馆会员Service
 */
public interface LibraryMemberService {

    /**
     * 通过会员条形码获取会员信息
     */
    LibraryMember getMemberByBarCode(String barCode);

    /**
     * 通过账号id获取会员信息
     */
    LibraryMember getMemberByUmsId(Long umsId);

    /**
     * 通过会员id更新会员信息
     */
    void updateMemberByMemberId(LibraryMember libraryMember);
}
