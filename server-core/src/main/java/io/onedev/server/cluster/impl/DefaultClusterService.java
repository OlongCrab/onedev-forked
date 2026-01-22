package io.onedev.server.cluster.impl;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.jspecify.annotations.Nullable;

import com.hazelcast.cluster.Member;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.cp.IAtomicLong;

import io.onedev.server.cluster.ClusterService;
import io.onedev.server.cluster.ClusterTask;
import io.onedev.server.replica.ProjectReplica;

public class DefaultClusterService implements ClusterService{

  @Override
  public void start() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'start'");
  }

  @Override
  public void postStart() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'postStart'");
  }

  @Override
  public void preStop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'preStop'");
  }

  @Override
  public void stop() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'stop'");
  }

  @Override
  public Collection<String> getOnlineServers() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getOnlineServers'");
  }

  @Override
  public boolean isLeaderServer() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isLeaderServer'");
  }

  @Override
  public @Nullable HazelcastInstance getHazelcastInstance() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getHazelcastInstance'");
  }

  @Override
  public void initWithLead(IAtomicLong data, Callable<Long> initializer) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'initWithLead'");
  }

  @Override
  public <T> T runOnServer(Member server, ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'runOnServer'");
  }

  @Override
  public <T> T runOnServer(String serverAddress, ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'runOnServer'");
  }

  @Override
  public <T> Map<String, T> runOnAllServers(ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'runOnAllServers'");
  }

  @Override
  public <T> Map<String, T> runOnServers(Collection<String> servers, ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'runOnServers'");
  }

  @Override
  public <T> Map<String, Future<T>> submitToAllServers(ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'submitToAllServers'");
  }

  @Override
  public <T> Map<String, Future<T>> submitToServers(Collection<String> servers, ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'submitToServers'");
  }

  @Override
  public <T> Future<T> submitToServer(String serverAddress, ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'submitToServer'");
  }

  @Override
  public <T> Future<T> submitToServer(Member server, ClusterTask<T> task) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'submitToServer'");
  }

  @Override
  public String getServerUrl(String serverAddress) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServerUrl'");
  }

  @Override
  public int getHttpPort(String serverAddress) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getHttpPort'");
  }

  @Override
  public int getSshPort(String serverAddress) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getSshPort'");
  }

  @Override
  public String getServerHost(String serverAddress) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServerHost'");
  }

  @Override
  public String getServerName(String serverAddress) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServerName'");
  }

  @Override
  public String getServerAddress(Member server) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServerAddress'");
  }

  @Override
  public String getLeaderServerAddress() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLeaderServerAddress'");
  }

  @Override
  public String getLocalServerAddress() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLocalServerAddress'");
  }

  @Override
  public String getCredential() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getCredential'");
  }

  @Override
  public @Nullable Member getServer(String serverAddress, boolean mustExist) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServer'");
  }

  @Override
  public List<String> getServerAddresses() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getServerAddresses'");
  }

  @Override
  public void redistributeProjects(Map<Long, LinkedHashMap<String, ProjectReplica>> replicas) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'redistributeProjects'");
  }

  @Override
  public LinkedHashMap<String, ProjectReplica> addProject(Map<Long, LinkedHashMap<String, ProjectReplica>> replicas,
      Long projectId) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'addProject'");
  }

  @Override
  public boolean isClusteringSupported() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isClusteringSupported'");
  }

}
